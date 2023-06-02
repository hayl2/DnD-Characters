public class Dice {
    private int num;

        public int roll4(){
            num = (int) Math.random() * 4 + 1;
            return num;
        }
        
        public int roll6(){
            num = (int) Math.random() * 6 + 1;
            return num;
        }
    
        public int roll8(){
            num = (int) Math.random() * 8 + 1;
            return num;
        }
    
        public int roll10(){
            num = (int) Math.random() * 10 + 1;
            return num;
        }
    
        public int roll12(){
            num = (int) Math.random() * 12 + 1;
            return num;
        }
    
        public int roll20(){
            num = (int) Math.random() * 20 + 1;
            return num;
        }
        
  }

