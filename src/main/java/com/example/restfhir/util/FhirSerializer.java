package com.example.restfhir.util;

import ca.uhn.fhir.context.FhirContext;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.hl7.fhir.instance.model.api.IBaseResource;

import java.io.IOException;

public class FhirSerializer extends JsonSerializer<IBaseResource> {
    @Override
    public void serialize(IBaseResource value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        FhirContext ctx = FhirContext.forDstu3();
        String json = ctx.newJsonParser().encodeResourceToString(value);
        gen.writeRaw(json);
    }

    @Override
    public Class<IBaseResource> handledType() {
        return IBaseResource.class;
    }
}
