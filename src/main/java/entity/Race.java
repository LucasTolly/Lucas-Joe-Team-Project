package entity;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "races", schema = "team_project", catalog = "")
public class Race {
    private String raceName;
    private String pfsrdLink;

    @Id
    @Column(name = "race_name", nullable = false, length = 20)
    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    @Basic
    @Column(name = "pfsrd_link", nullable = true, length = 200)
    public String getPfsrdLink() {
        return pfsrdLink;
    }

    public void setPfsrdLink(String pfsrdLink) {
        this.pfsrdLink = pfsrdLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Race race = (Race) o;

        if (raceName != null ? !raceName.equals(race.raceName) : race.raceName != null) return false;
        if (pfsrdLink != null ? !pfsrdLink.equals(race.pfsrdLink) : race.pfsrdLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = raceName != null ? raceName.hashCode() : 0;
        result = 31 * result + (pfsrdLink != null ? pfsrdLink.hashCode() : 0);
        return result;
    }
}
