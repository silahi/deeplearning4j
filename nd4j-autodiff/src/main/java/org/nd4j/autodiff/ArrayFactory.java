package org.nd4j.autodiff;

import org.nd4j.linalg.factory.Nd4j;

import java.util.Random;

public class ArrayFactory implements AbstractFactory<ArrayField> {

    private static final ArrayFactory m_INSTANCE = new ArrayFactory();
    private Random randomGenerator = new Random();

    private ArrayFactory() {
    }


    public static ArrayFactory instance() {
        return m_INSTANCE;
    }


    @Override
    public ArrayField val(double v) {
        // return Nd4j.valueArrayOf(v,i);
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField abs(ArrayField x) {
        return x.abs();
    }

    @Override
    public ArrayField min(ArrayField x, ArrayField y) {
       /* return x.doubleValue() < y.doubleValue() ? new ArrayField(
                x.doubleValue()) : new ArrayField(y.doubleValue());*/
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField max(ArrayField x, ArrayField y) {
     /*   return x.doubleValue() > y.doubleValue() ? new ArrayField(
                x.doubleValue()) : new ArrayField(y.doubleValue());*/
        throw new UnsupportedOperationException();
    }

    private static final ArrayField m_ZERO = new ArrayField(Nd4j.scalar(0.0));
    private static final ArrayField m_UNIT = new ArrayField(Nd4j.scalar(1.0));

    @Override
    public ArrayField zero() {
        return m_ZERO;
    }

    @Override
    public ArrayField one() {
        return m_UNIT;
    }

    @Override
    public ArrayField cos(ArrayField x) {
        return x.cos();
    }

    @Override
    public ArrayField acos(ArrayField x) {
        return x.acos();
    }

    @Override
    public ArrayField cosh(ArrayField x) {
        return x.cosh();
    }

    @Override
    public ArrayField acosh(ArrayField x) {
        return x.acosh();
    }

    @Override
    public ArrayField sin(ArrayField x) {
        return x.sin();
    }

    @Override
    public ArrayField asin(ArrayField x) {
        return x.asin();
    }

    @Override
    public ArrayField sinh(ArrayField x) {
        return x.sinh();
    }

    @Override
    public ArrayField asinh(ArrayField x) {
        return x.asinh();
    }

    @Override
    public ArrayField tan(ArrayField x) {
        return x.tan();
    }

    @Override
    public ArrayField atan(ArrayField x) {
        return x.atan();
    }

    @Override
    public ArrayField atan2(ArrayField x, ArrayField y) {
        //   return new ArrayField(Math.atan2(x.doubleValue(), y.doubleValue()));
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField tanh(ArrayField x) {
        return x.tanh();
    }

    @Override
    public ArrayField atanh(ArrayField x) {
        return x.atanh();
    }

    @Override
    public ArrayField exp(ArrayField x) {
        return x.exp();
    }

    @Override
    public ArrayField log(ArrayField x) {
        return x.log();
    }

    @Override
    public ArrayField log10(ArrayField x) {
        return x.log10();
    }

    @Override
    public ArrayField flat(ArrayField x) {
      /*  double xValue = x.doubleValue();
        return new ArrayField(-xValue + (xValue + xValue) * randomGenerator.nextDouble());*/
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField mc(ArrayField x, ArrayField y) {
      /*  double max = Math.max(x.doubleValue() * (1 + y.doubleValue()),
                x.doubleValue() * (1 - y.doubleValue()));
        double min = Math.min(x.doubleValue() * (1 + y.doubleValue()),
                x.doubleValue() * (1 - y.doubleValue()));
        return new ArrayField(min + (max - min) * randomGenerator.nextDouble());*/
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField rand(ArrayField x) {
        return new ArrayField(Nd4j.rand(x.getInput().shape()));
    }

    @Override
    public ArrayField random(ArrayField x) {
        return new ArrayField(Nd4j.rand(x.getInput().shape()));
    }

    @Override
    public ArrayField gauss(ArrayField x) {
        return new ArrayField(Nd4j.randn(x.getInput().shape()));
    }

    @Override
    public ArrayField sgn(ArrayField x) {
        return x.sgn();
    }

    @Override
    public ArrayField ifx(ArrayField x, ArrayField y, ArrayField z) {
        //return x.doubleValue() > .5 ? y : z;
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField buf(ArrayField x) {
        //return x.doubleValue() > .5 ? new ArrayField(1) : new ArrayField(0);
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayField inv(ArrayField x) {
        //  return x.doubleValue() > .5 ? new ArrayField(0) : new ArrayField(1);
        throw new UnsupportedOperationException();

    }

    @Override
    public ArrayField u(ArrayField x) {
        //return x.doubleValue() > 0 ? new ArrayField(1) : new ArrayField(0);
        throw new UnsupportedOperationException();

    }

    @Override
    public ArrayField uramp(ArrayField x) {
        // return x.doubleValue() > 0 ? new ArrayField(x.doubleValue()) : new ArrayField(0);
        throw new UnsupportedOperationException();

    }

    @Override
    public ArrayField pow(ArrayField x, ArrayField y) {
        return x.pow(y);
    }

    @Override
    public ArrayField pwr(ArrayField x, ArrayField y) {
        return x.pwr(y);
    }

    @Override
    public ArrayField pwrs(ArrayField x, ArrayField y) {
        return x.pwrs(y);
    }

    @Override
    public ArrayField sqrt(ArrayField x) {
        return x.sqrt();
    }

    @Override
    public ArrayField square(ArrayField x) {
        return x.square();
    }

    @Override
    public ArrayField hypot(ArrayField x, ArrayField y) {
        return x.pow(2).plus(y.pow(2)).sqrt();
    }

    @Override
    public ArrayField floor(ArrayField value) {
        return value.floor();
    }

    @Override
    public ArrayField ceil(ArrayField value) {
        return value.ceil();
    }

    @Override
    public ArrayField round(ArrayField value) {
        return value.round();
    }

}
