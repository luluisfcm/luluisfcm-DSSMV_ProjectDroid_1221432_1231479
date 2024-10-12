package models;
import java.util.UUID;

public class Library {
    private UUID id;
    private String name;
    private String address;
    private String openTime;
    private String closeTime;
    private String openDays;
    private String openStatement;
    private boolean open;

    public Library(UUID id, String name, String address, String openTime, String closeTime, String openDays, String openStatement, boolean open) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.openDays = openDays;
        this.openStatement = openStatement;
        this.open = open;
    }
}

