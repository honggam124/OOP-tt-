public class VegetableFactory {
        public Vegetable getVegetable(String type) {
            if(type.equalsIgnoreCase("cabbage")==true) 
                return new Cabbage();
            if(type.equalsIgnoreCase("carrot")==true) 
                return new Carrot();
            if(type.equalsIgnoreCase("pumpkin")==true) 
                return new Pumpkin();
            if(type == null) return null;
            return null;
        }
}