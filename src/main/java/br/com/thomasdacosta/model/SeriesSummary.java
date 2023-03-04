package br.com.thomasdacosta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * SeriesSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-04T15:19:40.974750600-03:00[America/Sao_Paulo]")


public class SeriesSummary   {
  @JsonProperty("resourceURI")
  private String resourceURI = null;

  @JsonProperty("name")
  private String name = null;

  public SeriesSummary resourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
    return this;
  }

  /**
   * The path to the individual series resource.
   * @return resourceURI
   **/
  @ApiModelProperty(value = "The path to the individual series resource.")

    public String getResourceURI() {
    return resourceURI;
  }

  public void setResourceURI(String resourceURI) {
    this.resourceURI = resourceURI;
  }

  public SeriesSummary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The canonical name of the series.
   * @return name
   **/
  @ApiModelProperty(value = "The canonical name of the series.")

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeriesSummary seriesSummary = (SeriesSummary) o;
    return Objects.equals(this.resourceURI, seriesSummary.resourceURI) &&
        Objects.equals(this.name, seriesSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceURI, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesSummary {\n");

    sb.append("    resourceURI: ").append(toIndentedString(resourceURI)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
