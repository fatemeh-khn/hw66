import com.maktab.serviceImpl.TeamServiceImpl;

import java.sql.SQLException;

public class AppMain {

    public AppMain() {
        System.out.println("bvhgc");
    }

    public static void main(String[] args) throws SQLException {
        TeamServiceImpl footballService = new TeamServiceImpl();
        footballService.addMenu();
/*        Team team = new Team();
        team.setName("fars");
        footballService.add(team);
        footballService.deleteById(2);
        Team fars = footballService.showInformation("fars");
        System.out.println(fars);*/
    }
}
