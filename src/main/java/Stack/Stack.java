package Stack;


public class Stack {
    int size = 5;
    int[] arr = new int[size];
    int top;

    Stack(){
        top = -1;
    }

    boolean isempty(){
        if (top == -1){
            return true;
        }else {
            return false;
        }
    }

    boolean isfull(){
        if (top == size - 1){
            return true;
        }else{
            return false;
        }
    }

    void add(int element){
        if(isfull()){
            System.out.println("Can't insert more.");
        }else {
            top++;
            arr[top] = element;
        }
    }

    int delete(){
        int element;
        if (isempty()){
            System.out.println("The stack is empty.");
            return (-1);
        }else {
            element = arr[top];
            top--;
        }
        System.out.println("The deleted element is : " + element);
        return(element);
    }

    void display(){
        if (isempty()){
            System.out.println("The Queue is empty.");
        } else {
            for (int i = 0; i <= top;i++){
                System.out.println(arr[i] + " ");
            }
        }
    }


    public static void main(String[] args){
        Stack s = new Stack();

        s.add(23);
        s.add(45);
        s.add(56);
        s.add(67);

        s.display();


        s.delete();
        s.display();

    }

}
