package ma.enset.mcpserver.tools;

import org.springaicommunity.mcp.annotation.McpArg;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class McpTools {

    @McpTool(name = "getEmployee" ,description = " get information about employee")
    public Employee getEmployee(@McpArg(description = "the employee name ") String name) {
        return new Employee(name ,15000,4);
    }
    @McpTool( description = "Get all employees")
    public List<Employee> getAllEmployees() {

        return List.of(
                new Employee("Ayman",15000,4),
                new Employee("Sanae",10000,3),
                new Employee("minouch",2,1)
        );
    }
}
record Employee (String name, double salary, int seniority) {}
