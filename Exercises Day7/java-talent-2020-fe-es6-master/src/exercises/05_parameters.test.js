test('can be triggered when the incoming argument is undefined', () => {
    function getName(name = 'John Doe') {
        return name;
    }

    expect(getName('Doge'))
        .toBe('Doge');
    expect(getName(undefined))
        .toBe('John Doe');
    expect(getName(null))
        .toBe(null);
    expect(getName())
        .toBe('John Doe');
});

test('can trigger a function call', () => {
    let triggerCount = 0;

    function getName(name = getDefault()) {
        return name;
    }

    function getDefault() {
        triggerCount++;
        return 'John Doe';
    }

    expect(triggerCount)
        .toBe(0);
    expect(getName('Aaron'))
        .toBe('Aaron');
    expect(getName())
        .toBe('John Doe');
    expect(getName(undefined))
        .toBe('John Doe');
    expect(triggerCount)
        .toBe(2);
});

test('catch non-specified params', () => {
    function resty(first, second, ...others) {
        return others;
    }

    expect(resty().length)
        .toBe(0);
    expect(resty(1).length)
        .toBe(0);
    expect(resty(1, 2).length)
        .toBe(0);
    expect(resty(1, 2, 3).length)
        .toBe(1);
    expect(
        resty(1, 2, 3, undefined, 5, undefined, 7, undefined, 9, 10).length
    )
        .toBe(8);
});

test('it can default all arguments, optionally', () => {
    // Modify the method signature of `myFunction` to allow for
    // all args to be optional

    function myFunction({ name='John Doe', age=25, favoriteBand='Queen' }={}) {
        expect(name)
            .toBeDefined();
        expect(age)
            .toBeDefined();
        expect(favoriteBand)
            .toBeDefined();
    }

    myFunction({ name: 'John Doe', age: 25, favoriteBand: 'Queen' });
    myFunction({ name: 'John Doe', age: 37 });
    myFunction({ name: 'John Doe' });
    myFunction({});
    myFunction();
});
