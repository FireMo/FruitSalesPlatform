package com.lican.nowcooer;

class Node{
    private Object data;
    private Node nextNode;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}


public class LianBiao {

    private Node headNode;
    private int size;

    /**
     * 添加node
     * @param node
     */
    void addNode(Node node){
        if (size == 0){
            headNode = node;
        } else {
            node.setNextNode(headNode);
            headNode = node;
        }
        size++;
    }
    /**
     * 查询数据
     */
    private Node findNode(Object data){
        int sizeTemp = size;
        Node xianzaiNode = headNode;
        while (sizeTemp > 0) {
            if (xianzaiNode.getData().equals(data)){
                return xianzaiNode;
            }else {
                xianzaiNode = xianzaiNode.getNextNode();
            }
            sizeTemp--;
        }
        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.setData("北京航空航天大学");
        Node node2 = new Node();
        node2.setData("西安交通大学");
        LianBiao lianBiao = new LianBiao();
        lianBiao.addNode(node1);
        lianBiao.addNode(node2);
        Node node = lianBiao.findNode("北京航空航天大学");
        Object obj = node.getData();
        System.out.println(obj);
    }


}
