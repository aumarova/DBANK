package selenium.advancedLocators;
import com.github.javafaker.Faker;

public class JavaFaker {

    public static void main(String[] args) {

        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().fullName());
        System.out.println(faker.name().title());
        System.out.println(faker.name().username());

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().buildingNumber());
        System.out.println(faker.country().name());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.internet().emailAddress());
        System.out.println("faker.internet().domainName() = " + faker.internet().domainName());

        System.out.println(faker.regexify("(0[1-9]|1[012])[/](0[1-9]|[12][0-9]|3[01])[/](19)\\d\\d"));

        System.out.println("faker.demographic().sex() = " + faker.demographic().sex());
        System.out.println(faker.demographic().sex().substring(0, 1));
    }



}
