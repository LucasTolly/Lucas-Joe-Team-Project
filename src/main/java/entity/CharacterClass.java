package entity;

import javax.persistence.*;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
@Table(name = "classes", schema = "team_project", catalog = "")
public class CharacterClass {
    private String className;
    private String pfsrdLink;

    @Id
    @Column(name = "class_name", nullable = false, length = 25)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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

        CharacterClass that = (CharacterClass) o;

        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (pfsrdLink != null ? !pfsrdLink.equals(that.pfsrdLink) : that.pfsrdLink != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = className != null ? className.hashCode() : 0;
        result = 31 * result + (pfsrdLink != null ? pfsrdLink.hashCode() : 0);
        return result;
    }
}
