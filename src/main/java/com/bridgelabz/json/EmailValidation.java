package com.bridgelabz.json;


        import com.fasterxml.jackson.databind.JsonNode;
        import com.fasterxml.jackson.databind.ObjectMapper;
        import com.github.fge.jsonschema.core.report.ProcessingReport;
        import com.github.fge.jsonschema.main.JsonSchema;
        import com.github.fge.jsonschema.main.JsonSchemaFactory;

        import java.io.File;

public class EmailValidation {
    public static void main(String[] args) {
        try{
            ObjectMapper obj=new ObjectMapper();
            JsonNode node=obj.readTree(new File("Schema.json"));
            JsonNode data=obj.readTree(new File("studentInfo.json"));

            JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
            JsonSchema schema = factory.getJsonSchema(node);

            ProcessingReport report = schema.validate(data);
            if (report.isSuccess()) {
                System.out.println("Email is valid!");
            } else {
                System.out.println("Email is invalid!");
                System.out.println(report);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

