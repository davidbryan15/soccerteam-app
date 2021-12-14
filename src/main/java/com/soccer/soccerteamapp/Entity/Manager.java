package com.soccer.soccerteamapp.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manager")
public class Manager {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int mgr_id;

    @Column(name = "MGR_FNAME")
    private String mgrFirstName;

    @Column(name = "MGR_LNAME")
    private String mgrLastName;

    @Column(name = "MGR_EMAIL")
    private String mgrEmail;

    @ManyToMany
    @JoinTable(
            name = "TEAM_MGR_ASSGN",
            joinColumns = @JoinColumn(name = "mgr_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> teams;

    public Manager() {
    }

    public Manager(String mgrFirstName, String mgrLastName, String mgrEmail) {
        this.mgrFirstName = mgrFirstName;
        this.mgrLastName = mgrLastName;
        this.mgrEmail = mgrEmail;
    }

    public int getMgr_id() {
        return mgr_id;
    }

    public void setMgr_id(int mgr_id) {
        this.mgr_id = mgr_id;
    }

    public String getMgrFirstName() {
        return mgrFirstName;
    }

    public void setMgrFirstName(String mgrFirstName) {
        this.mgrFirstName = mgrFirstName;
    }

    public String getMgrLastName() {
        return mgrLastName;
    }

    public void setMgrLastName(String mgrLastName) {
        this.mgrLastName = mgrLastName;
    }

    public String getMgrEmail() {
        return mgrEmail;
    }

    public void setMgrEmail(String mgrEmail) {
        this.mgrEmail = mgrEmail;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgr_id=" + mgr_id +
                ", mgrFirstName='" + mgrFirstName + '\'' +
                ", mgrLastName='" + mgrLastName + '\'' +
                ", mgrEmail='" + mgrEmail + '\'' +
                '}';
    }
}
