package OOPS.LibraryManagement;

public class Member {
    String name;

    String memberId;

    boolean isActive;

    Member(String name, String memberId, boolean isActive) {
        this.name = name;
        this.memberId = memberId;
        this.isActive = isActive;

    }

    boolean checkMembershipstatus() {
        return isActive;
    }

}
