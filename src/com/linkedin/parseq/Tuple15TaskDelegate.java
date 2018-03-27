package com.linkedin.parseq;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import com.linkedin.parseq.function.Tuple15;
import com.linkedin.parseq.promise.PromiseException;
import com.linkedin.parseq.promise.PromiseListener;
import com.linkedin.parseq.promise.PromiseUnresolvedException;
import com.linkedin.parseq.trace.ShallowTrace;
import com.linkedin.parseq.trace.ShallowTraceBuilder;
import com.linkedin.parseq.trace.Trace;
import com.linkedin.parseq.trace.TraceBuilder;

public class Tuple15TaskDelegate<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> implements Tuple15Task<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {

  private final Task<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> _task;

  public Tuple15TaskDelegate(Task<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> task) {
    _task = task;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean cancel(Exception reason) {
    return _task.cancel(reason);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> get() throws PromiseException {
    return _task.get();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Throwable getError() throws PromiseUnresolvedException {
    return _task.getError();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> getOrDefault(Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> defaultValue) throws PromiseUnresolvedException {
    return _task.getOrDefault(defaultValue);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getName() {
    return _task.getName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getPriority() {
    return _task.getPriority();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean setPriority(int priority) {
    return _task.setPriority(priority);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void await() throws InterruptedException {
    _task.await();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void contextRun(Context context, Task<?> parent, Collection<Task<?>> predecessors) {
    _task.contextRun(context, parent, predecessors);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean await(long time, TimeUnit unit) throws InterruptedException {
    return _task.await(time, unit);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public ShallowTrace getShallowTrace() {
    return _task.getShallowTrace();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void addListener(PromiseListener<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> listener) {
    _task.addListener(listener);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Trace getTrace() {
    return _task.getTrace();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isDone() {
    return _task.isDone();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isFailed() {
    return _task.isFailed();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Long getId() {
    return _task.getId();
  }

  @Override
  public void setTraceValueSerializer(Function<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>, String> serializer) {
    _task.setTraceValueSerializer(serializer);
  }

  @Override
  public ShallowTraceBuilder getShallowTraceBuilder() {
    return _task.getShallowTraceBuilder();
  }

  @Override
  public TraceBuilder getTraceBuilder() {
    return _task.getTraceBuilder();
  }

}
