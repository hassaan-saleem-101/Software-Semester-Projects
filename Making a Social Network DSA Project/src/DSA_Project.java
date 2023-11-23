
import java.util.*;

        public class DSA_Project {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                Scanner input1 = new Scanner(System.in);
                Hashing hashing = new Hashing();

                profile p1 = new profile("sahal@gmail.com","Sahal","sahal1234");

                profile p2 = new profile("moeez@gmail.com","Moeez","moeez1234");

                profile p3 = new profile("shahzaib@gmail.com","Shahzaib Shahid","1234567810");

                profile p4 = new profile("hamdbinkhalid@gmail.com","Hamd Khalid","hamd1234");


                hashing.insert(p1);
                hashing.insert(p2);
                hashing.insert(p3);
                hashing.insert(p4);

                hashing.addFriend(p1,p2);
                hashing.addFriend(p1,p3);
                hashing.addFriend(p2,p3);
                hashing.addFriend(p3,p4);

                hashing.block(p1,p4);
                hashing.block(p2,p4);


                System.out.print("Press 1 to Log In and 0 for Sign Up: ");
                int choice = input.nextInt();

                if(choice == 1){
                    System.out.print("Enter Login Email Id :");
                    String emailId = input1.nextLine();
                    System.out.print("Enter Password : ");
                    String password = input1.nextLine();

                    if(hashing.getProfileVerified(new profile(emailId,password))){
                        System.out.println("Logged In\n");

                        int choice2 = 0;
                        while (choice2 != 4) {
                            System.out.println("\nPress 0 to view your personal data");
                            System.out.println("Press 1 to View Your Friend List");
                            System.out.println("Press 2 to View Your Block List");
                            System.out.println("Press 3 to Message Anyone");
                            System.out.println("Press 4 to Exit");

                            choice2 = input.nextInt();

                            if (choice2 == 0) {
                                System.out.println("\n--------<Personal Information>--------");
                                System.out.println("Name: " + hashing.profiles[hashing.getProfile(emailId)].name);
                                System.out.println("Name: " + hashing.profiles[hashing.getProfile(emailId)].emailId);
                            }
                            if (choice2 == 1) {
                                System.out.println("\n--------<Friend List>--------");
                                hashing.printFriends(hashing.profiles[hashing.getProfile(emailId)]);
                            }
                            if (choice2 == 2) {
                                System.out.println("\n--------<Block List>--------");
                                hashing.printBlockList(hashing.profiles[hashing.getProfile(emailId)]);
                            }
                            if (choice2 == 3) {
                                System.out.println("\n--------<List Of Profiles>--------");
                                hashing.printProfiles();
                                System.out.print("\nEnter The Email Of Profile To Which You Want To Send Message: ");
                                String emailForMessage = input1.nextLine();
                                profile profileForMessage = hashing.profiles[hashing.getProfile(emailForMessage)];
                                if (hashing.isBlock(hashing.profiles[hashing.getProfile(emailId)], profileForMessage)) {
                                    System.out.println("You cant send message to " + profileForMessage.name + " because you have blocked him");
                                } else {
                                    System.out.print("Enter Message: ");
                                    String message = input1.nextLine();
                                    System.out.println("\nMessage Sent....");
                                }
                            }

                        }
                    }else{
                        System.out.println("Not Verified!");
                    }
                }else if(choice == 0) {
                    profile newProfile = null;
                    System.out.print("Enter Name: ");
                    String name = input1.nextLine();
                    System.out.print("Enter Your Email Id: ");
                    String email = input1.nextLine();
                    System.out.print("Enter Password : ");
                    String password = input1.nextLine();
                    System.out.print("Confirm Password: ");
                    String ReEnterPassword = input1.nextLine();
                    if (password.equals(ReEnterPassword)) {
                        newProfile = new profile(email, name, password);
                        hashing.insert(newProfile);
                    } else {
                        System.out.println("Password does not match");
                    }
                    int loopBreaker = 0;
                    while (loopBreaker != 1) {


                        System.out.println("Enter 0 To Add Friends");
                        System.out.println("Enter 1 To Exit");
                        System.out.println("");
                        loopBreaker = input.nextInt();
                        if (loopBreaker == 0) {
                            System.out.println("\n------<Recommendations>------");
                            System.out.println("");
                            hashing.printRecommendations(newProfile);

                            System.out.print("Enter email to add Friends: ");
                            String emailToAdd = input1.nextLine();
                            hashing.addFriend(newProfile, hashing.profiles[hashing.getProfile(emailToAdd)]);
                            hashing.printProfiles(hashing.profiles[hashing.getProfile(email)]);
                        }
                    }
                }
            }

        }

        class profile{
            String emailId,name,password;
            int adjMat[][] = new int[20][20];

            public profile(String emailId, String name, String password) {
                this.emailId = emailId;
                this.name = name;
                this.password = password;
            }

            public profile(String emailId, String password) {
                this.emailId = emailId;
                this.password = password;
            }

            public profile() {
            }
        }

        class Hashing{
            profile[] profiles = new profile[20];
            Scanner input = new Scanner(System.in);
            profile profileObj = new profile();

            boolean insert(profile profile){
                int index = hashCode(profile.emailId);
                if (profiles[index] == null) {
                    profiles[index] = profile;
                    return true;
                } else {
                    while (profiles[index] != null) {
                        if (index < profiles.length - 1) {
                            if (profiles[index] == null) {
                                profiles[index] = profile;
                                System.out.println(index);
                                return true;
                            } else if (profiles[index + 1] == null) {
                                profiles[index + 1] = profile;
                                return true;
                            } else {
                                index++;
                            }
                        }
                        else {
                            resizingArray(profiles);
                        }
                    }
                    return false;
                }
            }


            void resizingArray(profile[] array){
                System.out.println("Resizing");
                profile[] temp = new profile[2 * profiles.length];
                for (int i = 0; i < profiles.length; i++) {
                    temp[i] = profiles[i];
                }
                profiles = temp;
            }

            void printProfiles(profile profile){
                if (profile != null){
                    System.out.println("Name: "+profile.name);
                    System.out.println("Email Address: "+profile.emailId);
                    printFriends(profile);
                    System.out.println("");
                }
            }


            boolean getProfileVerified(profile profile){
                int index = hashCode(profile.emailId);
                if (profiles[index] == null){
                    return false;
                }else if (!profiles[index].emailId.equals(profile.emailId)) {
                    while (!profiles[index].emailId.equals(profile.emailId)) {
                        index = index + 1;
                    }
                }else if(profiles[index].password.equals(profile.password)){
                    return true;
                }
                return false;
            }

            int getProfile(String email){

                int index = hashCode(email);
                if (profiles[index] == null){
                    return -1;
                }
                if (!profiles[index].emailId.equals(email)) {
                    while (!profiles[index].emailId.equals(email)) {
                        index = index + 1;
                    }
                }
                return index;

            }

            int hashCode(String email){
                int char1 = (int)email.charAt(0);
                int char2 = 0;

                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@'){
                        char2 = (int)email.charAt(i-1);
                        break;
                    }
                }


                return (char1+char2) % profiles.length;
            }

            boolean addFriend(profile p1,profile p2){

                    int ind1=getProfile(p1.emailId);//improve it
                    int ind2=getProfile(p2.emailId);
                    if (ind1 != -1 && ind2 != -1){
                        profileObj.adjMat[ind1][ind2]=1;
                        profileObj.adjMat[ind2][ind1]=1;
                        return true;
                    }//for undirected graph
                    return false;
            }

            boolean block(profile p1,profile p2){
                int ind1=getProfile(p1.emailId);//improve it
                int ind2=getProfile(p2.emailId);
                if (ind1 != -1 && ind2 != -1){
                    profileObj.adjMat[ind1][ind2] = 100; //100 is the indication that user is block
                    profileObj.adjMat[ind2][ind1] = 100; //100 is the indication that user is block
                    return true;
                }//for undirected graph
                return false;
            }

            void printRecommendations(profile p1){
                for(int i = 0 ; i < profiles.length ; i++){
                    if(profiles[i] != null && profiles[i] != p1 && !isFriend(p1,profiles[i])){
                        System.out.println("Name: "+profiles[i].name);
                        System.out.println("Email Id: "+profiles[i].emailId);
                        System.out.println("");
                    }
                }
            }

            void printProfiles(){
                for(int i = 0 ; i < profiles.length ; i++){
                    if(profiles[i] != null){
                        System.out.println("Name: "+profiles[i].name);
                        System.out.println("Email Id: "+profiles[i].emailId);
                        System.out.println("");
                    }
                }
            }


            void printFriends(profile p1){
                int j = 1;
                for (int i = 0; i < profiles.length ; i++) {
                    if (profiles[i] != null && isFriend(p1,profiles[i])){
                        System.out.println(j+"- "+profiles[i].name);
                        j++;
                    }
                }
            }

            void printBlockList(profile p1){
                int j = 1;
                for (int i = 0; i < profiles.length ; i++) {
                    if (profiles[i] != null && isBlock(p1,profiles[i])){
                        System.out.println(j+"- "+profiles[i].name);
                        j++;
                    }
                }
            }

            boolean isFriend(profile p1, profile p2){
                if (profileObj.adjMat[getProfile(p1.emailId)][getProfile(p2.emailId)] == 1){
                    return true;
                }
                return false;
            }

            boolean isBlock(profile p1, profile p2){
                if (profileObj.adjMat[getProfile(p1.emailId)][getProfile(p2.emailId)] == 100){
                    return true;
                }
                return false;
            }


        }