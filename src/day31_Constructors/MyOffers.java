package day31_Constructors;

import day31_Constructors.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        Offer offer2= new Offer();
        Offer offer3= new Offer();
        Offer offer4= new Offer();
        Offer offer5= new Offer();
        Offer offer6= new Offer();
        Offer offer7= new Offer();

        offer1.setInfo("Virginia", "Bank of America", "Sdet", 150000, true, true, false, true);
        offer2.setInfo("New York", "Cydeo", "Software Developer", 20000, false, true, true, true);
        offer3.setInfo("Virginia", "Amazon", "Sdet", 180000, true, true, false, true);
        offer4.setInfo("Virginia", "Facebook", "Software Developer", 50000, true, false, false, false);
        offer5.setInfo("Austin", "Twitter", "Scrum Master", 150000, false, true, false, true);
        offer6.setInfo("Virginia", "Safety Skills", "Product Owner", 150000, true, true, false, true);
        offer7.setInfo("Boston", "Tesla", "Sdet", 40000, false, false, false, false);

        Offer[] offers= {offer1, offer2, offer3, offer4, offer5, offer6, offer7};
        ArrayList<Offer> fullTime=new ArrayList<>(Arrays.asList(offers));

        fullTime.removeIf(p-> p.isFullTime==false);
        System.out.println(fullTime);

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(offers));
        localOffers.removeIf(p-> !p.location.equalsIgnoreCase("Virginia"));
        System.out.println(localOffers);

        ArrayList<Offer> offersWithBenefits=new ArrayList<>(Arrays.asList(offers));
        offersWithBenefits.removeIf(p-> p.hasPTO==false || p.hasBenefit==false);
        System.out.println(offersWithBenefits);

        ArrayList<Offer> sdetOffers=new ArrayList<>(Arrays.asList(offers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("Sdet"));
        System.out.println(sdetOffers);

        ArrayList<Offer> offersWith100K=new ArrayList<>(Arrays.asList(offers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K);



    }
}
/*
2. Create a class named MyOffers:

				/2.1 Create 7 objects of Offer
				/2.2 Create an array of Offers named myOffers and store all 7 objects of offers
				/2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
				/		2.3.1 Write a program that can remove the offer objects that are not full-time
				//2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
				/		2.4.1 Write a program that can remove all the offers that are not from local
				/2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
				//		2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
				/2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
				//		2.6.1 Write a program that can remove all the offers that are not for SDET
				2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
						2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */