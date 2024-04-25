package hackerrank.days30ofCode;

public class Singleton {
        private static Singleton instance;
        public String str;
        private Singleton (){
        }
        static Singleton getSingleInstance (){
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;

        }

    }
