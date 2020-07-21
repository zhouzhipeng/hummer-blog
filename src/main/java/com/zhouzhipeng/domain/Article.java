package com.zhouzhipeng.domain;


import javax.persistence.*;

import java.io.Serializable;

/**
 * A Article.
 */
@Entity
@Table(name = "article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content_2")
    private String content2;

    @Column(name = "auther")
    private String auther;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Article title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent2() {
        return content2;
    }

    public Article content2(String content2) {
        this.content2 = content2;
        return this;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public String getAuther() {
        return auther;
    }

    public Article auther(String auther) {
        this.auther = auther;
        return this;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Article)) {
            return false;
        }
        return id != null && id.equals(((Article) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Article{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", content2='" + getContent2() + "'" +
            ", auther='" + getAuther() + "'" +
            "}";
    }
}
