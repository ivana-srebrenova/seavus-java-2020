const noop = () => {
};

function getAddress() {
    return {
        city: 'Skopje',
        zip: 1000,
        coords: {
            lat: 41.9960,
            long: -21.4316
        }
    };
}

function getNumbers() {
    return [1, 2, 3, 4, 5, 6];
}

test('can be used to pull apart objects', () => {
    // Using destructuring, call `getAddress()` and create a 'city' and 'zip' variable.
    const{city,zip} = getAddress();
    expect(city)
        .toBe('Skopje');
    expect(zip)
        .toBe(1000);
});


test('can alias destructured variables', () => {
    // Using destructuring, call `getAddress()` and pull the city and zip out, and alias them to c, z, respectively
    const{city:c, zip:z}=getAddress();
    expect(c)
        .toBe('Skopje');
    expect(z)
        .toBe(1000);
    expect(() => noop(city))
        .toThrow();
    expect(() => noop(zip))
        .toThrow();
});

test('can be used to pull apart arrays', () => {
    // Call getNumbers and pull the first value out as `one` and the second as `two`
    const[one,two]=getNumbers();
    expect(one)
        .toBe(1);
    expect(two)q
        .toBe(2);
});
