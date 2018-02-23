public class B {

    public static void main(String[] args) {

        String[][] roster = new String[6][5];

        roster[4][4] = "nika";



        String[][] yellowPage = {{"shaheer", "571-365-4566"},

                {"shahid", "703-224-5564"},

                {"patrick", "571-256-4456"}};

        String[][][] threed = new String[2][2][2];



        String[][][] yellowPages = {{{"shaheer", "571-365-4566"},

                {"shahid", "703-224-5564"},

                {"patrick", "571-256-4456"}},



                {{"shah", "571-365-4566"},

                        {"hid", "703-224-5564"},

                        {"pat", "571-256-4456"}}

        };



        for (int row = 0; row < yellowPages.length; row++) {

            for (int col = 0; col < yellowPages[row].length; col++) {

                for (int page = 0; page < yellowPages.length; page++) {

                    System.out.println ( yellowPages[row][col][page] );

                }

            }

        }

    }

}