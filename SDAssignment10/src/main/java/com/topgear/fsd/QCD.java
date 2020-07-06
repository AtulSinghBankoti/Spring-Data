package com.topgear.fsd;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCD is a Querydsl query type for CD
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCD extends EntityPathBase<CD> {

    private static final long serialVersionUID = 1052971343L;

    public static final QCD cD = new QCD("cD");

    public final NumberPath<Long> cdId = createNumber("cdId", Long.class);

    public final NumberPath<Float> cdPrice = createNumber("cdPrice", Float.class);

    public final StringPath cdPublisher = createString("cdPublisher");

    public final StringPath cdTitle = createString("cdTitle");

    public QCD(String variable) {
        super(CD.class, forVariable(variable));
    }

    public QCD(Path<? extends CD> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCD(PathMetadata metadata) {
        super(CD.class, metadata);
    }

}

