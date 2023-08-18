package com.mantu.InstagramBackendApp.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mantu.InstagramBackendApp.model.enums.PostType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PostId;
    private String postContent;
    private String postCaption;
    private String postLocation;
    @Enumerated(value = EnumType.STRING)
    private PostType postType;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY) // hide this in json but not in database table column
    private LocalDateTime postCreatedTimeStamp;

    @ManyToOne
    @JoinColumn(name = "fk_post_user_id")
    private User postOwner;
}
