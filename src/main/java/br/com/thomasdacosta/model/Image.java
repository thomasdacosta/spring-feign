package br.com.thomasdacosta.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Image
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-04T15:19:40.974750600-03:00[America/Sao_Paulo]")


public class Image   {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("extension")
  private String extension = null;

  public Image path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The directory path of to the image.
   * @return path
   **/
  @ApiModelProperty(value = "The directory path of to the image.")

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Image extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The file extension for the image.
   * @return extension
   **/
  @ApiModelProperty(value = "The file extension for the image.")

    public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.path, image.path) &&
        Objects.equals(this.extension, image.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");

    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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
