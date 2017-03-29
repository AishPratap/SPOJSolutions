import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by aishpratap on 1/10/17.
 */
public class BalancedTree {

  public static void main(String[] args){

    BalancedTree btree = new BalancedTree();
    Node root = btree.createRoot();
    root.setId("Root");

    Node topLeftChild = btree.addChild(root,"tlChild");
    Node leftChild = btree.addChild(topLeftChild,"leftChild");
    btree.addChild(topLeftChild,"lchild2");

    Node llChild = btree.addChild(leftChild,"lchild21");
    btree.addChild(leftChild,"lchild22");

    btree.addChild(llChild,"lchild211");
    btree.addChild(llChild,"lchild212");

    Node topRightChild = btree.addChild(root, "rlChild");
    btree.addChild(topRightChild,"rchild1");
    btree.addChild(topRightChild,"rchild2");

    btree.printTree(root, " ");

    if (btree.isBalanced(root)){
      System.out.println("Balanced Tree");
    }else{
      System.out.println("unbalanced Tree");
    }

    System.out.println((btree.findSuccessor(leftChild).getIdentifier()));
  }

  public Node createRoot(){
    return new Node(null);
  }

  public Node addChild(Node parent, String id){
    Node childNode = new Node(parent);
    childNode.setId(id);
    parent.getChildren().add(childNode);
    return childNode;
  }

  public void printTree(Node parent, String prefix){

    System.out.println(prefix + parent.getIdentifier());

    for (Node each:parent.getChildren()){
      printTree(each,prefix+prefix);
    }

  }

  public Node findSuccessor(Node node){
    if (node != null){
      Node temp;

      if (node.parent == null && node.getChildren().size()>1){
        temp = leftMostChild(node);
      }else{
        while ((temp = node.parent) != null){
          if (temp.getChildren().get(0) == node){
            break;
          }
          node = temp;
        }
      }
      return temp;
    }
    return null;
  }

  public Node leftMostChild(Node node){
    if (node == null)
      return null;

    while (node.getChildren().size() > 0){
      node = node.getChildren().get(0);
    }

    return node;
  }

  public boolean isBalanced(Node root){

    return (maxDepth(root) - minDepth(root) <= 1);

  }

  public int minDepth(Node root){
    if (root.getChildren().size() == 0){
      return 0;
    }

    List<Integer> depths = new ArrayList();

    for (Node child:root.getChildren()){
      depths.add(minDepth(child));
    }

    return 1 + Collections.min(depths);
  }

  public int maxDepth(Node root){
    if (root.getChildren().size() == 0){
      return 0;
    }

    List<Integer> depths = new ArrayList();

    for (Node child:root.getChildren()){
      depths.add(maxDepth(child));
    }

    return 1 + Collections.max(depths);
  }

  class Node{
    Node parent;
    List<Node> children = new ArrayList<>();
    String id;

    public Node(Node parent){
      this.parent = parent;
    }

    public void setId(String identifier){
      this.id = identifier;
    }

    public String getIdentifier(){
      return this.id;
    }

    public List<Node> getChildren(){
      return this.children;
    }
  }
}
