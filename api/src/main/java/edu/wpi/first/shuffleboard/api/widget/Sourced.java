package edu.wpi.first.shuffleboard.api.widget;

import edu.wpi.first.shuffleboard.api.data.IncompatibleSourceException;
import edu.wpi.first.shuffleboard.api.sources.DataSource;

import javafx.collections.ObservableList;

/**
 * Common interface for objects that have data sources.
 */
public interface Sourced {

  /**
   * Adds a source.
   *
   * @param source the source to add
   *
   * @throws IncompatibleSourceException if the source is not compatible with this object
   */
  void addSource(DataSource source) throws IncompatibleSourceException;

  /**
   * Gets an observable list of the sources for this object.
   */
  ObservableList<DataSource> getSources();

}