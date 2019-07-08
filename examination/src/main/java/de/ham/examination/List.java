package de.ham.examination;

import java.util.Collection;

public interface List<Integer>
    extends Collection<Integer> {
  /**
   * Returns the number of elements in this list.
   * [...]
   *
   * @return the number of elements in this list
   */
  int size();

  /**
   * Returns the element at the specified position in
   * this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position
   *         in this list
   * @throws IndexOutOfBoundsException if the index
   *         is out of range
   *         [...]
   */
  Integer get(int index);

}
