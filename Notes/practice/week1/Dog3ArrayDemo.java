public class Dog3ArrayDemo {
        public static void main(String[] args) {
            /* Create an array of two dogs. */
            Dog3[] dogs = new Dog3[2];
            dogs[0] = new Dog3(8);
            dogs[1] = new Dog3(20);

            /* Yipping will result, since dogs[0] has weight 8. */
            dogs[0].makeNoise();
        }
    }
}
