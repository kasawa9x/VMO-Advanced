package LambdaExpressions.FunctionalInterface;

//Functional Interface là một interface có một phương thức abstract
// nó cũng có thể được gọi là Single Abstract Interface
//Nếu một interface đã có annotation @FunctionalInterface và
// chúng ta cố gắng thêm vào các phương thức khác thì
// trình biên dịch sẽ ném ra lỗi.
// Lợi ích chính của functional interface là chúng ta có thể sử dụng
// Lambda Expression để tạo ra thể hiện (instance) cho interface đó

public class Main {
    public static void main(String[] argv) {
        //gán biểu thức lambda cho functional interface
        Processor stringProcessor = (String str) -> str.length();
        String str = "Java Lambda";
        // gọi phương thức được định nghĩa
        // bên trong functional interface và truyền tham số
        int length = stringProcessor.getStringLength(str);
        System.out.println(length);

        Hello s = (name, com) -> "Hello, " + name + ". Welcome to " + com;
        System.out.println(s.sayHello("newbie", "Lambda"));
    }
}

