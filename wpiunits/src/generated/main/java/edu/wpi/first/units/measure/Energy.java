// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpiunits/generate_units.py. DO NOT MODIFY

package edu.wpi.first.units.measure;

import static edu.wpi.first.units.Units.*;
import edu.wpi.first.units.*;

@SuppressWarnings({"unchecked", "cast", "checkstyle", "PMD"})
public interface Energy extends Measure<EnergyUnit> {
  static  Energy ofRelativeUnits(double magnitude, EnergyUnit unit) {
    return new ImmutableEnergy(magnitude, unit.toBaseUnits(magnitude), unit);
  }

  static  Energy ofBaseUnits(double baseUnitMagnitude, EnergyUnit unit) {
    return new ImmutableEnergy(unit.fromBaseUnits(baseUnitMagnitude), baseUnitMagnitude, unit);
  }

  @Override
  Energy copy();

  @Override
  default MutEnergy mutableCopy() {
    return new MutEnergy(magnitude(), baseUnitMagnitude(), unit());
  }

  @Override
  EnergyUnit unit();

  @Override
  default EnergyUnit baseUnit() { return (EnergyUnit) unit().getBaseUnit(); }

  @Override
  default double in(EnergyUnit unit) {
    return unit.fromBaseUnits(baseUnitMagnitude());
  }

  @Override
  default Energy unaryMinus() {
    return (Energy) unit().ofBaseUnits(0 - baseUnitMagnitude());
  }

  @Override
  default Energy plus(Measure<? extends EnergyUnit> other) {
    return (Energy) unit().ofBaseUnits(baseUnitMagnitude() + other.baseUnitMagnitude());
  }

  @Override
  default Energy minus(Measure<? extends EnergyUnit> other) {
    return (Energy) unit().ofBaseUnits(baseUnitMagnitude() - other.baseUnitMagnitude());
  }

  @Override
  default Energy times(double multiplier) {
    return (Energy) unit().ofBaseUnits(baseUnitMagnitude() * multiplier);
  }

  @Override
  default Energy divide(double divisor) {
    return (Energy) unit().ofBaseUnits(baseUnitMagnitude() / divisor);
  }

  @Override
  default Power per(TimeUnit period) {
    return divide(period.of(1));
  }


  @Override
  default Mult<EnergyUnit, AccelerationUnit<?>> times(Acceleration<?> multiplier) {
    return (Mult<EnergyUnit, AccelerationUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, AccelerationUnit<?>> divide(Acceleration<?> divisor) {
    return (Per<EnergyUnit, AccelerationUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, AngleUnit> times(Angle multiplier) {
    return (Mult<EnergyUnit, AngleUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, AngleUnit> divide(Angle divisor) {
    return (Per<EnergyUnit, AngleUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, AngularAccelerationUnit> times(AngularAcceleration multiplier) {
    return (Mult<EnergyUnit, AngularAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, AngularAccelerationUnit> divide(AngularAcceleration divisor) {
    return (Per<EnergyUnit, AngularAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, AngularMomentumUnit> times(AngularMomentum multiplier) {
    return (Mult<EnergyUnit, AngularMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, AngularMomentumUnit> divide(AngularMomentum divisor) {
    return (Per<EnergyUnit, AngularMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, AngularVelocityUnit> times(AngularVelocity multiplier) {
    return (Mult<EnergyUnit, AngularVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, AngularVelocityUnit> divide(AngularVelocity divisor) {
    return (Per<EnergyUnit, AngularVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, CurrentUnit> times(Current multiplier) {
    return (Mult<EnergyUnit, CurrentUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, CurrentUnit> divide(Current divisor) {
    return (Per<EnergyUnit, CurrentUnit>) Measure.super.divide(divisor);
  }

  @Override
  default Energy divide(Dimensionless divisor) {
    return (Energy) Joules.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }

  @Override
  default Energy times(Dimensionless multiplier) {
    return (Energy) Joules.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }


  @Override
  default Mult<EnergyUnit, DistanceUnit> times(Distance multiplier) {
    return (Mult<EnergyUnit, DistanceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, DistanceUnit> divide(Distance divisor) {
    return (Per<EnergyUnit, DistanceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, EnergyUnit> times(Energy multiplier) {
    return (Mult<EnergyUnit, EnergyUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Dimensionless divide(Energy divisor) {
    return Value.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<EnergyUnit, ForceUnit> times(Force multiplier) {
    return (Mult<EnergyUnit, ForceUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, ForceUnit> divide(Force divisor) {
    return (Per<EnergyUnit, ForceUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Power times(Frequency multiplier) {
    return Watts.of(baseUnitMagnitude() * multiplier.baseUnitMagnitude());
  }

  @Override
  default Per<EnergyUnit, FrequencyUnit> divide(Frequency divisor) {
    return (Per<EnergyUnit, FrequencyUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, LinearAccelerationUnit> times(LinearAcceleration multiplier) {
    return (Mult<EnergyUnit, LinearAccelerationUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, LinearAccelerationUnit> divide(LinearAcceleration divisor) {
    return (Per<EnergyUnit, LinearAccelerationUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, LinearMomentumUnit> times(LinearMomentum multiplier) {
    return (Mult<EnergyUnit, LinearMomentumUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, LinearMomentumUnit> divide(LinearMomentum divisor) {
    return (Per<EnergyUnit, LinearMomentumUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, LinearVelocityUnit> times(LinearVelocity multiplier) {
    return (Mult<EnergyUnit, LinearVelocityUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, LinearVelocityUnit> divide(LinearVelocity divisor) {
    return (Per<EnergyUnit, LinearVelocityUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, MassUnit> times(Mass multiplier) {
    return (Mult<EnergyUnit, MassUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, MassUnit> divide(Mass divisor) {
    return (Per<EnergyUnit, MassUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, MomentOfInertiaUnit> times(MomentOfInertia multiplier) {
    return (Mult<EnergyUnit, MomentOfInertiaUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, MomentOfInertiaUnit> divide(MomentOfInertia divisor) {
    return (Per<EnergyUnit, MomentOfInertiaUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, MultUnit<?, ?>> times(Mult<?, ?> multiplier) {
    return (Mult<EnergyUnit, MultUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, MultUnit<?, ?>> divide(Mult<?, ?> divisor) {
    return (Per<EnergyUnit, MultUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, PerUnit<?, ?>> times(Per<?, ?> multiplier) {
    return (Mult<EnergyUnit, PerUnit<?, ?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, PerUnit<?, ?>> divide(Per<?, ?> divisor) {
    return (Per<EnergyUnit, PerUnit<?, ?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, PowerUnit> times(Power multiplier) {
    return (Mult<EnergyUnit, PowerUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, PowerUnit> divide(Power divisor) {
    return (Per<EnergyUnit, PowerUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, TemperatureUnit> times(Temperature multiplier) {
    return (Mult<EnergyUnit, TemperatureUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, TemperatureUnit> divide(Temperature divisor) {
    return (Per<EnergyUnit, TemperatureUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, TimeUnit> times(Time multiplier) {
    return (Mult<EnergyUnit, TimeUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Power divide(Time divisor) {
    return Watts.of(baseUnitMagnitude() / divisor.baseUnitMagnitude());
  }


  @Override
  default Mult<EnergyUnit, TorqueUnit> times(Torque multiplier) {
    return (Mult<EnergyUnit, TorqueUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, TorqueUnit> divide(Torque divisor) {
    return (Per<EnergyUnit, TorqueUnit>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, VelocityUnit<?>> times(Velocity<?> multiplier) {
    return (Mult<EnergyUnit, VelocityUnit<?>>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, VelocityUnit<?>> divide(Velocity<?> divisor) {
    return (Per<EnergyUnit, VelocityUnit<?>>) Measure.super.divide(divisor);
  }


  @Override
  default Mult<EnergyUnit, VoltageUnit> times(Voltage multiplier) {
    return (Mult<EnergyUnit, VoltageUnit>) Measure.super.times(multiplier);
  }

  @Override
  default Per<EnergyUnit, VoltageUnit> divide(Voltage divisor) {
    return (Per<EnergyUnit, VoltageUnit>) Measure.super.divide(divisor);
  }

}