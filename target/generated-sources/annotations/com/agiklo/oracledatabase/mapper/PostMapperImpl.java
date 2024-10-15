package com.agiklo.oracledatabase.mapper;

import com.agiklo.oracledatabase.entity.Comment;
import com.agiklo.oracledatabase.entity.Employee;
import com.agiklo.oracledatabase.entity.Post;
import com.agiklo.oracledatabase.entity.dto.CommentDTO;
import com.agiklo.oracledatabase.entity.dto.CommentDTO.CommentDTOBuilder;
import com.agiklo.oracledatabase.entity.dto.PostDTO;
import com.agiklo.oracledatabase.entity.dto.PostDTO.PostDTOBuilder;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T11:38:08+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.12 (Ubuntu)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO mapPostToDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTOBuilder postDTO = PostDTO.builder();

        postDTO.postId( post.getPostId() );
        if ( post.getCreatedAt() != null ) {
            postDTO.createdAt( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( post.getCreatedAt() ) );
        }
        postDTO.authorFirstName( postAuthorFirstName( post ) );
        postDTO.authorLastName( postAuthorLastName( post ) );
        postDTO.title( post.getTitle() );
        postDTO.content( post.getContent() );
        postDTO.comments( mapCommentsToDTO( post.getComments() ) );

        return postDTO.build();
    }

    @Override
    public Set<CommentDTO> mapCommentsToDTO(Set<Comment> comments) {
        if ( comments == null ) {
            return null;
        }

        Set<CommentDTO> set = new HashSet<CommentDTO>( Math.max( (int) ( comments.size() / .75f ) + 1, 16 ) );
        for ( Comment comment : comments ) {
            set.add( commentToCommentDTO( comment ) );
        }

        return set;
    }

    private String postAuthorFirstName(Post post) {
        if ( post == null ) {
            return null;
        }
        Employee author = post.getAuthor();
        if ( author == null ) {
            return null;
        }
        String firstName = author.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String postAuthorLastName(Post post) {
        if ( post == null ) {
            return null;
        }
        Employee author = post.getAuthor();
        if ( author == null ) {
            return null;
        }
        String lastName = author.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    protected CommentDTO commentToCommentDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTOBuilder commentDTO = CommentDTO.builder();

        if ( comment.getCreatedAt() != null ) {
            commentDTO.createdAt( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( comment.getCreatedAt() ) );
        }
        commentDTO.content( comment.getContent() );

        return commentDTO.build();
    }
}
