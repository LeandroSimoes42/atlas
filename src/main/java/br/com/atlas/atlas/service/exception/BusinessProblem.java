package br.com.atlas.atlas.service.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Problem;
import org.zalando.problem.StatusType;
import org.zalando.problem.ThrowableProblem;

import javax.annotation.Nullable;
import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class BusinessProblem extends AbstractThrowableProblem implements Problem {

    private static final Set<String> RESERVED_PROPERTIES = new HashSet<>(
            Arrays.asList("type", "title", "status", "detail", "instance", "cause", "code", "message")
    );
    private String message;
    private String code;

    @Builder
    public BusinessProblem(
            @Nullable final String code,
            @Nullable final String title,
            @Nullable final StatusType status,
            @Nullable final String message,
            @Nullable final ThrowableProblem cause,
            @Nullable final URI instance,
            @Nullable final Map<String, Object> parameters,
            @Nullable final String detail
    ) {
        super(null, title, status, detail, instance, cause, parameters);
        this.code = code;
        this.message = message;
    }
}
