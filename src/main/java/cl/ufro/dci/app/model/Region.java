package cl.ufro.dci.app.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rgn_id")
    private Long rgnId;

    @Column(name = "rgn_nombre")
    private String rgnNombre;

    @OneToMany(mappedBy = "region")
    private List<Comuna> comunaList;

    public Region() {
    }

    public Region(String rgnNombre) {
        this.rgnNombre = rgnNombre;
    }

    public Region(Long rgnId, String rgnNombre) {
        this.rgnId = rgnId;
        this.rgnNombre = rgnNombre;
    }

    public Long getRgnId() {
        return rgnId;
    }

    public void setRgnId(Long rgnId) {
        this.rgnId = rgnId;
    }

    public String getRgnNombre() {
        return rgnNombre;
    }

    public void setRgnNombre(String rgnNombre) {
        this.rgnNombre = rgnNombre;
    }

    public List<Comuna> getComunaList() {
        return comunaList;
    }

    public void setComunaList(List<Comuna> comunaList) {
        this.comunaList = comunaList;
    }
}
