public class ObjectTrackerParser {
    // Ignore this
    public static void main(String[] args) throws Exception {
        ObjectTrackerParser parser = new ObjectTrackerParser();

        try {
            parser.run(args);
        } catch(Exception ex) {
            throw (ex);
        }
        
    }

    public void run (String[] args) throws Exception
    {
        // Ignore this
        Jevois jevois = new Jevois();

        // Read in the Jevois string
        String jevoisString = jevois.readString();

        // Parse the information
        String[] inputs = jevoisString.split(" ");

        // Stronly type the coordinates
        int x = Integer.parseInt(inputs[1]);
        int y = Integer.parseInt(inputs[2]);

        // Proof
        System.out.println("x: " + x);
        System.out.print("y: " + y);
    }

    // Fake the Jevois class
    private class Jevois {
        public String readString() {
            return "T2 666 -666";
        }
    }
}
