package com.mballem.demo_park_api.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import javax.management.relation.Role;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="username",nullable = false, unique = true, length = 50)
    private String username;
    @Column(name="password", nullable = false,length = 200)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 25)
    private Role role;
    @Column(name="data_criacao")
    private LocalDateTime dataModificacao;
    @Column(name="criado_pro")
    private String criadoPor;
    @Column(name="modificado_por")
    private String modificadoPor;

    public Usuario(String password, String username, Long id, Role role, LocalDateTime dataModificacao, String criadoPor, String modificadoPor) {
        this.password = password;
        this.username = username;
        this.id = id;
        this.role = role;
        this.dataModificacao = dataModificacao;
        this.criadoPor = criadoPor;
        this.modificadoPor = modificadoPor;
    }

    public Usuario() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public enum Role {
        Role_Admin,Role_CLIENTE
    }


}
