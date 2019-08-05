//import org.junit.Test;
//import ru.tsystems.javaschool.entities.City;
//import ru.tsystems.javaschool.services.CityService;
//
//import java.util.List;
//
//public class CityServiceTest {
//
//    CityService cityService = new CityService();
//
//    @Test
//    public void testAddCity(){
//        City city1 = new City();
//        //city1.setId(5);
//        city1.setName("Murmansk");
//
//        City city = cityService.addCity(city1);
//        System.out.println(city);
//    }
//
//    @Test
//    public void testDeleteCity(){
//        City city1 = new City();
//        //city1.setId(5);
//        city1.setName("Novgorod");
//        City city = cityService.addCity(city1);
//        cityService.deleteCity(city.getId());
//    }
//
//    @Test
//    public void testGetCity(){
//        City city1 = new City();
//        //city1.setId(5);
//        city1.setName("Novgorod");
//        City city = cityService.addCity(city1);
//        City cityFromDB = cityService.getCity(city.getId());
//        System.out.println(cityFromDB);
//    }
//
//    @Test
//    public void testUpdateCity(){
//        City city1 = new City();
//        //city1.setId(5);
//        city1.setName("Moscow");
//        city1 = cityService.addCity(city1);
//        city1.setName("SPB");
//        cityService.updateCity(city1);
//        city1.setName("Saint-Petersburg");
//        City city = cityService.getCity(city1.getId());
//        System.out.println(city);
//
//    }
//
//
//    @Test
//    public void testGetAll(){
//        List<City> cities = cityService.getAll();
//        for(City city: cities){
//            System.out.println(city);
//        }
//    }
//
//}
