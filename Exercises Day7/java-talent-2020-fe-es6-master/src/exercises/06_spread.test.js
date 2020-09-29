test(`should be able to call a function and spread the arguments`, () => {
    const args = ['a', 'b', 'c'];
    let calls = 0;

    myFunction(...args);
    // call myFunction using the spread operator with args

    expect(calls)
        .toBe(1);

    function myFunction(a, b, c) {
        expect(a)
            .toBe('a');
        expect(b)
            .toBe('b');
        expect(c)
            .toBe('c');
        calls++;
    }
});

test(`should be easier to concatenate arrays`, () => {
    const array1 = [1, 2, 3];
    // create a result array that uses the spread operator to concatenate array1 with [4, 5, 6]
    const result=[...array1, 4, 5, 6];
    expect(result)
        .toEqual([1, 2, 3, 4, 5, 6]);
});

test(`should be able to merge properties from objects`, () => {
    const obj1 = {
        foo: 'bar',
        baz: 'foobar'
    };
    // create a result object that uses the spread operator to add `eggs: 'spam'` to what exists in obj1
    const result = {...obj1, eggs: 'spam'}
    expect(result)
        .toEqual({
            foo: 'bar',
            baz: 'foobar',
            eggs: 'spam'
        });
});
