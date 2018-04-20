package test;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *ugug
 * @author Boti
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_usuario;
    @Column(length=100)
    private String nombre;
    @Column(length=100)
    private String apellidos;
    @Column(length=9)
    private String DNI;
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;
    //Column(length=?)
    private Long tipo_usuario;
    @Column(length=100)
    private String email;
    @Column(length=100)
    private String direccion;
    //@Column(length=2)
    private String sexo;
    @ElementCollection
    private List<Documento> documentos;
    private Cuota cuota;
    //Preguntar
    private Promesa promesa;
    //Preguntar
    private Inscripcion inscripcion;
    //Preguntaruhiu
    @Lob
    @Column(length=10000)
    private byte[] data;

    //Getters y Setters
    public Long getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Long getTipo_usuario() {
        return tipo_usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public Cuota getCuota() {
        return cuota;
    }


    public Promesa getPromesa() {
        return promesa;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public byte[] getData() {
        return data;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setTipo_usuario(Long tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public void setPromesa(Promesa promesa) {
        this.promesa = promesa;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public void setData(byte[] data) {
        this.data = data;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_usuario != null ? id_usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id_usuario == null && other.id_usuario != null) || (this.id_usuario != null && !this.id_usuario.equals(other.id_usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pcera.practicagrupal.Ususario[ id=" + id_usuario + " ]";
    }

}