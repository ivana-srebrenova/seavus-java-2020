import log from './helpers/pretty-log';

function basic() {
    // what is returned?
    let x = 100;
    const y = 200;
    return { x: x, y: y };
}

log(basic())

function ifBlock() {
    // what is returned?
    if (3 > 1) {
        const x = 34;
        let y = 43;
    }
    return { x: x, y: y };
}

// log(ifBlock())

function scoped() {
    // what is returned?
    let x = 33;
    {
        const x = 123;
    }
    return x;
}

// log(scoped())