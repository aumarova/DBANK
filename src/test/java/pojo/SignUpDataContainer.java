package pojo;
import com.github.javafaker.Faker;
import java.util.*;

public class SignUpDataContainer {

    public static User generate() {
        User use = new User();
        use.setTitle(generateTitle());
        use.setFirstName(generateFirstName());
        use.setLastName(generateLastName());
        use.setGender(generateGender());
        use.setDOB(generateDob());
        use.setSSN(generateSsn());
        use.setEmail(generateEmail());
        String password = generatePassword();
        use.setPassword(password);
        use.setConfirmPassword(password);
        use.setAddress(generateAddress());
        use.setCity(generateCity());
        use.setState(generateState());
        use.setZip(generateZip());
        use.setCountry(generateCountry());
        use.setHomePhone(generateHomePhone());
        use.setMobilePhone(generateMobilePhone());
        use.setWorkPhone(generateWorkPhone());
        use.setWorkPhone(generateWorkPhone());
        return use;
    }

    static Faker faker = new Faker();

    public static String generateTitle() {
        List<String> titles = new ArrayList<>();
        titles.add("Mr.");
        titles.add("Ms.");
        titles.add("Mrs.");
        Random rand = new Random();
        return titles.get(rand.nextInt(titles.size()));
    }

    public static String generateFirstName() {
        return faker.name().firstName();
    }


    public static String generateLastName() {
        return faker.name().lastName();
    }


    public static String generateGender() {
        return faker.demographic().sex().substring(0, 1);
    }


    public static String generateDob() {
       return faker.regexify("(0[1-9]|1[012])[/](0[1-9]|[12][0-9]|3[01])[/](19)\\d\\d");
    }


    public static String generateSsn() {
        return faker.regexify("[0-8]\\d{2}-\\d{2}-\\d{4}");
    }


    public static String generateEmail() {
        return faker.internet().emailAddress();
    }


    public static String generatePassword() {

        return faker.internet().password(8, 15, true, false, true);
    }


    public static String generateAddress() {
        return faker.address().streetAddress();
    }


    public static String generateCity() {
        return faker.address().city();
    }

    public static String generateState() {
        return faker.address().state();
    }


    public static String generateZip() {
        return faker.address().zipCode();
    }


    public static String generateCountry() {
        return faker.address().country();
    }


    public static String generateHomePhone() {
        return faker.phoneNumber().cellPhone();
    }


    public static String generateMobilePhone() {
        return faker.phoneNumber().cellPhone();
    }


    public static String generateWorkPhone() {
        return faker.phoneNumber().cellPhone();
    }


}