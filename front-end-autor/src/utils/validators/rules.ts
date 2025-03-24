export default class Rules {
    private schema: string = '';

    string(): Rules {
        this.schema = this.schema + '-isString-';
        return this;
    }

    max(num: number): Rules {
        this.schema = this.schema + `-max(${num})-`;
        return this;
    }

    min(num: number): Rules {
        this.schema = this.schema + `-min(${num})-`;
        return this;
    }

    get() {
        const val = this.schema;
        this.schema = '';
        return val;
    }
}
