package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Comment;
import com.agiklo.oracledatabase.entity.Employee;
import com.agiklo.oracledatabase.entity.Post;
import com.agiklo.oracledatabase.entity.dto.CommentDTO;
import com.agiklo.oracledatabase.entity.dto.CommentDTO.CommentDTOBuilder;
import java.time.format.DateTimeFormatter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T10:28:19+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDTO mapCommentToDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTOBuilder commentDTO = CommentDTO.builder();

        commentDTO.postId( commentPostPostId( comment ) );
        if ( comment.getCreatedAt() != null ) {
            commentDTO.createdAt( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( comment.getCreatedAt() ) );
        }
        commentDTO.commentAuthorFirstName( commentAuthorFirstName( comment ) );
        commentDTO.commentAuthorLastName( commentAuthorLastName( comment ) );
        commentDTO.content( comment.getContent() );

        return commentDTO.build();
    }

    private Long commentPostPostId(Comment comment) {
        if ( comment == null ) {
            return null;
        }
        Post post = comment.getPost();
        if ( post == null ) {
            return null;
        }
        Long postId = post.getPostId();
        if ( postId == null ) {
            return null;
        }
        return postId;
    }

    private String commentAuthorFirstName(Comment comment) {
        if ( comment == null ) {
            return null;
        }
        Employee author = comment.getAuthor();
        if ( author == null ) {
            return null;
        }
        String firstName = author.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String commentAuthorLastName(Comment comment) {
        if ( comment == null ) {
            return null;
        }
        Employee author = comment.getAuthor();
        if ( author == null ) {
            return null;
        }
        String lastName = author.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }
}
