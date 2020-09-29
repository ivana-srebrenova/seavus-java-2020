const noop = () => {
};
test('can be used in place of `var`', () => {
    // Declare bandName using 'let'
    // Declare isBestBand using 'let'
   let bandName='Queen';
   let isBestBand=true;
   expect(bandName)
        .toBe('Queen');
    expect(isBestBand)
        .toBe(true);
});

test('can modify the value of a `let` variable even in the next block statement', () => {
    let releaseName = 'ES6';
    {
        releaseName = 'ES2015';
    }
    expect(releaseName)
        .toBe('ES2015');
});

test('cannot modify the value of a `const` variable', () => {
    function getReleaseName() {
        // Pick your side. Do you call it ES6, or ES2015?
        // You cannot have `const` and reassign the value!
        let releaseName = 'ES6'; // If you call it ES2015, then change this to let or var
        releaseName = 'ES2015'; // If you call it ES6, then remove this reassignment
        return releaseName;
    }

    expect(getReleaseName)
        .not
        .toThrow();
});

test('is trapped inside of an `if` statement', () => {

  if (true) {
        let b = 1;
    }
    expect(() => noop(b))

        .toThrow('b is not defined');
});
