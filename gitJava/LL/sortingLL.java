public class sortingLL {

    Node head;
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    void AddLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        return;
    }

    void printLL(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    void sort(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        Node temp = null;
        // while(curNode.next != null){
        //     nex = curNode.next;
        //     if(curNode.data > nex.data){
        //         int temp = curNode.data;
        //         curNode.data = nex.data;
        //         nex.data = temp;
        //         nex = nex.next;
        //     } --------------->>> this is write way but we have recursion
        //                          to make it applicable until the each node is sorted.
        //     curNode = curNode.next;
        // }


        while (curNode != null){
            temp = curNode.next;
            while(temp!= null){
                if(curNode.data > temp.data){
                    int tempo = curNode.data;
                    curNode.data = temp.data;
                    temp.data = tempo;
                }
                temp = temp.next;
            }
            curNode = curNode.next;   
        }
    }

    public static void main(String args[]){
        sortingLL list = new sortingLL();
        list.AddLast(3);
        list.AddLast(5);
        list.AddLast(4);
        list.AddLast(1);
        list.AddLast(2);
        list.printLL();
        list.sort();
        list.printLL();


    }
    
}

// while(curNode != null){
//     temp = curNode.next;
//     while(temp!= null){
//         if(curNode.data > temp.data){
//             tempo = curNode.data;
//             curNode.data = temp.data;
//             temp.data = tempo;
//         }
//         temp = temp.next;
//     }
//     curNode = curNode.next;
// }


