import com.maktab.model.entities.Team;
import com.maktab.repository.FootballRepository;
import com.maktab.service.FootballService;
import com.maktab.serviceImpl.FootballServiceImpl;

import java.sql.SQLException;

public class AppMain {

    public AppMain() {
        System.out.println("bvhgc");
    }

    public static void main(String[] args) throws SQLException {
        FootballService footballService=new FootballServiceImpl();
        Team team = new Team();
        team.setName("fars");
        footballService.add(team);
        footballService.deleteById(2);
        Team fars = footballService.showInformation("fars");
        System.out.println(fars);
    }
}
