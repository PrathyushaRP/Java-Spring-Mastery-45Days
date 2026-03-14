public class JvmDemo {
    public static void main(String[] args) {
        // Checking the Heap size set by the JVM
        long heapSize = Runtime.getRuntime().maxMemory();
        System.out.println("Max Heap Size: " + (heapSize / 1024 / 1024) + " MB");

        // Tricky Interview bit: Identifying where variables live
        int age = 25; // Stack (Primitive)
        String name = new String("Prathyusha"); // 'name' reference on Stack, Object on Heap
        
        System.out.println("JVM Demo complete hiiiii.");
    }
}