package com.github.marciovmartins.crnk.typeparser;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import java.util.UUID;

@JsonApiResource(type = "foo")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FooResource {

    @JsonApiId
    public UUID id;

}
