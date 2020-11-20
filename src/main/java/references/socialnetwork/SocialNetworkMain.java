package references.socialnetwork;

public class SocialNetworkMain {

    public static void main(String[] args) {

        SocialNetwork instsocialNetwork = new SocialNetwork();

        instsocialNetwork.addMember("Joe");
        instsocialNetwork.addMember("John");
        instsocialNetwork.addMember("Jane");
        instsocialNetwork.addMember("Richard");

        instsocialNetwork.connect("Joe", "John");
        instsocialNetwork.connect("John", "Joe");

        System.out.println(instsocialNetwork.bidirectionalConnections());
    }
}