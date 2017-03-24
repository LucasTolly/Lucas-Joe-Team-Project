package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Joe on 3/24/2017.
 */
@Entity
public class Alignment {
    private int alignmentId;
    private String lawfulChaotic;
    private String goodEvil;

    @Id
    @Column(name = "Alignment_Id", nullable = false)
    public int getAlignmentId() {
        return alignmentId;
    }

    public void setAlignmentId(int alignmentId) {
        this.alignmentId = alignmentId;
    }

    @Basic
    @Column(name = "Lawful_Chaotic", nullable = true, length = 255)
    public String getLawfulChaotic() {
        return lawfulChaotic;
    }

    public void setLawfulChaotic(String lawfulChaotic) {
        this.lawfulChaotic = lawfulChaotic;
    }

    @Basic
    @Column(name = "Good_Evil", nullable = true, length = 255)
    public String getGoodEvil() {
        return goodEvil;
    }

    public void setGoodEvil(String goodEvil) {
        this.goodEvil = goodEvil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Alignment alignment = (Alignment) o;

        if (alignmentId != alignment.alignmentId) return false;
        if (lawfulChaotic != null ? !lawfulChaotic.equals(alignment.lawfulChaotic) : alignment.lawfulChaotic != null)
            return false;
        if (goodEvil != null ? !goodEvil.equals(alignment.goodEvil) : alignment.goodEvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = alignmentId;
        result = 31 * result + (lawfulChaotic != null ? lawfulChaotic.hashCode() : 0);
        result = 31 * result + (goodEvil != null ? goodEvil.hashCode() : 0);
        return result;
    }
}
