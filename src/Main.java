import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String,String> nba = new HashMap<String,String>();

        nba.put("BOS","Celtics");
        nba.put("PHI","76ers");
        nba.put("NYK","Knicks");
        nba.put("BKN","Nets");
        nba.put("TOR","Raptors");
        nba.put("MIL","Timberwolves");
        nba.put("CLE","Cavaliers");
        nba.put("CHI","Bulls");
        nba.put("IND","Pacers");
        nba.put("DET","Pistons");
        nba.put("MIA","Heat");
        nba.put("ATL","Hornets");
        nba.put("WSH","Wizards");
        nba.put("ORL","Magic");
        nba.put("CHA","Hawks");
        nba.put("DEN","Nuggets");
        nba.put("MIN","Bucks");
        nba.put("OKC","Thunder");
        nba.put("UTA","Jazz");
        nba.put("POR","Trailblazers");
        nba.put("SAC","Kings");
        nba.put("PHX","Suns");
        nba.put("LAC","Clippers");
        nba.put("GSW","Warriors");
        nba.put("LAL","Lakers");
        nba.put("MEM","Grizzlies");
        nba.put("DAL","Mavericks");
        nba.put("NOP","Pelicans");
        nba.put("HOU","Rockets");
        nba.put("SAS","Spurs");

        System.out.println("HashMap of the NBA with four incorrect teams. Can you identify them?????");

        for(String i : nba.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(nba.get(i));
        }

        nba.replace("ATL","Hawks");
        nba.replace("CHA","Hornets");
        nba.replace("MIL","Bucks");
        nba.replace("MIN","Timberwolves");

        System.out.println("Correct HashMap displayed below:  \n");

        for(String i : nba.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(nba.get(i));
        }


    }
}