package com.github.marciovmartins.crnk.typeparser;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.DefaultResourceList;
import io.crnk.core.resource.list.ResourceList;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class FooRepository extends ResourceRepositoryBase<FooResource, UUID> {

    public FooRepository() {
        super(FooResource.class);
    }

    @Override
    public ResourceList<FooResource> findAll(QuerySpec querySpec) {
        return new DefaultResourceList<>();
    }

}
